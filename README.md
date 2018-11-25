软件项目管理工具maven

依赖:

依赖范围:compile(默认)、test、provided、runtime、system(引入外部依赖)、import

依赖冲突:就近原则(A->B->C);如果间接依赖中包含有同一个坐标不同版本的资源依赖，以配置顺序上方的版本为准

排除依赖（exclusions）




项目打包方式:jar、war、pom

生命周期:一组阶段的序列


继承与聚合

java项目
mvn archetype:generate -DgroupId=com.cn.taiji -Dartif
actId=Test -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=fa
lse

web项目
mvn archetype:generate -DgroupId=cn.xunge -DartifactId=MvnTest02 -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

强制下载依赖包:mvn –P nexus dependency:resolve

http://spring.io/
start.spring.io

IOC(控制反转)
DI(依赖注入)
用途：创建对象及组建

容器配置:

xml配置
java配置(基本不选用)
注释配置	

constructor-arg：通过构造函数注入。 
property：通过setter对应的方法注入。

mvn -Pnexus dependency:resolve  检查依赖包
	
@Component ：标准一个普通的spring Bean类。 子注解:@Repository、@Service、@Controller
@Repository：标注一个DAO组件类。 
@Service：标注一个业务逻辑组件类。 
@Controller：标注一个控制器组件类。 
@Autowired(require=false):初始化
@Qualifier 合格      
@Scope("prototype")多例
@resource

@PostConstruct
@RestController的意思就是controller里面的方法都以json格式输出

使用注解后，默认按照类名首字母小写作为id的值，也可以使用value属性指定id，value属性名也可以省略注解        
当你需要定义某个类为一个bean，则在这个类的类名前一行使用@Service("XXX"),就相当于讲这个类定义为一个bean，bean名称为XXX;

@Resource  当需要在某个类中定义一个属性，并且该属性是一个已存在的bean，要为该属性赋值或注入时在该属性上一行使用@Resource(name="xxx")，相当于为该属性注入一个名称为xxx的bean。

mvn package

jar zvf jar包

java -jar jar包 --spring-config-name
                --spring.config.location=classpath:/default.properties,classpath:/override.properties

spring boot devtools 热部署
dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-devtools</artifactId>
<optional>true</optional>
</dependency>


配置文件的生效顺序
A /config subdirectory of the current directory.
The current directory
A classpath /config package
The classpath root

日志
SLF4J

日志格式:
日志级别:trace(查找) debug(调试 ),info(消息),warn(警告),error(错误),fatal(严重错误)

management.security.enabled=false默认有一部分信息需要安全验证之后才可以查看，如果去掉这些安全认证，直接设置

