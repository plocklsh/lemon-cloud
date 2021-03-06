package cn.lemon.cloud.consumer.rpc.feign;

import cn.lemon.cloud.consumer.rpc.hytrix.ComputeServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lonyee on 2017/4/6.
 */
@FeignClient(value = "eureka-service", fallbackFactory = ComputeServiceFallbackFactory.class)
public interface IComputeService {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}