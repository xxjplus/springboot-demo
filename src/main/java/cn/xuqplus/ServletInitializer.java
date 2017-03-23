package cn.xuqplus;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 该类的功能为,
 * 当项目需要打包成war文件发布时容器的初始化配置
 * 另外
 * 当项目打成war包时,内嵌的tomcat容器应当是不需要的,所以在pom文件中应做相应的描述
 * 我的做法是建立两个profile,对应jar包和war包
 * 开发和调试时勾选jar,若有发布成war的需求则可使用该profile打包发布war包
 * Created by xuqplus on 17-3-23.
 */
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(SpringbootDemoApplication.class);
    }
}
