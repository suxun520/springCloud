package cn;

import java.util.List;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

public class SelfLoadBanlanceRule  extends AbstractLoadBalancerRule {

   
	
	private  int  total;   //计数器  数到5下一个机器
	
	private  int  index;   //当前使用机器
	
	
	public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
           
            //找到所有可用的机器
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == 0) {
                return null;
            }

            //没到5次   机器不变
          if(total<5  ) {
        	  server=upList.get(index);
        	  total++;
          }else {
        	  total=0;
        	  index++;
        	  //机器下标越界   置为0
			if(index>=upList.size()) {
				index=0;
			}
			
		}

          if (server == null) {
              Thread.yield();
              continue;
          }

          if (server.isAlive()) {
              return (server);
          }
          server = null;
          Thread.yield();
      }

      return server;

    }

   

	@Override
	public Server choose(Object key) {
		return choose(getLoadBalancer(), key);
	}

	

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
	}
}