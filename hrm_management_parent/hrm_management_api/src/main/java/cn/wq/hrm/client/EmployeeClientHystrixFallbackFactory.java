package cn.wq.hrm.client;

import cn.wq.hrm.domain.Employee;
import cn.wq.hrm.query.EmployeeQuery;
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
public class EmployeeClientHystrixFallbackFactory implements FallbackFactory<EmployeeClient> {

    @Override
    public EmployeeClient create(Throwable throwable) {
        return new EmployeeClient() {
            @Override
            public AjaxResult save(Employee employee) {
                return null;
            }

            @Override
            public AjaxResult delete(Integer id) {
                return null;
            }

            @Override
            public Employee get(Long id) {
                return null;
            }

            @Override
            public List<Employee> list() {
                return null;
            }

            @Override
            public PageList<Employee> json(EmployeeQuery query) {
                return null;
            }
        };
    }
}
