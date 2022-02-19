package ${package.Controller};

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.mybatisplus.common.JsonResponse;
import ${package.Service}.${table.serviceName};
import ${package.Entity}.${entity};


/**
 *
 *  前端控制器
 *
 *
 * @author ${author}
 * @since ${date}
 * @version v1.0
 */
@RestController
@RequestMapping("/${table.entityPath}")
public class ${table.controllerName} {

    private final Logger logger = LoggerFactory.getLogger( ${table.controllerName}.class );

    @Autowired
    private ${entity}Service ${entity?uncap_first}Service;

}

