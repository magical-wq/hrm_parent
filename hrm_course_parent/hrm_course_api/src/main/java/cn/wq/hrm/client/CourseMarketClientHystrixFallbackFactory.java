package cn.wq.hrm.client;

import cn.wq.hrm.domain.CourseMarket;
import cn.wq.hrm.query.CourseMarketQuery;
import cn.wq.hrm.util.AjaxResult;
import cn.wq.hrm.util.PageList;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * @author wq
 * @date 2019/8/30
 */
@Component
public class CourseMarketClientHystrixFallbackFactory implements FallbackFactory<CourseMarketClient> {

    @Override
    public CourseMarketClient create(Throwable throwable) {
        return new CourseMarketClient() {
            @Override
            public AjaxResult save(CourseMarket courseMarket) {
                return null;
            }

            @Override
            public AjaxResult delete(Integer id) {
                return null;
            }

            @Override
            public CourseMarket get(Long id) {
                return null;
            }

            @Override
            public List<CourseMarket> list() {
                return null;
            }

            @Override
            public PageList<CourseMarket> json(CourseMarketQuery query) {
                return null;
            }
        };
    }
}
