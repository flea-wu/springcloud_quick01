package fleawu.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-02-24 22:08
 */
@RestController
public class DiscoverController {

    // 服务发现
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/d")
    public String discover() {
        return JSON.toJSONString(discoveryClient.description());
    }

    @GetMapping(value = "/d/list")
    public String discover1() {
        return JSON.toJSONString(discoveryClient.getServices());
    }

    @GetMapping(value = "/d/list/detail")
    public String discover2() {
        return JSON.toJSONString(discoveryClient.getInstances("provider"));
    }
}
