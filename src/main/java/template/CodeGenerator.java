//package template;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.InjectionConfig;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.FileOutConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.TemplateConfig;
//import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
//import com.baomidou.mybatisplus.generator.config.po.TableInfo;
//import com.baomidou.mybatisplus.generator.config.rules.DbType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
///**
// * <p>
// * 代码生成器演示
// * </p>
// */
//public class CodeGenerator {
//	
//	public static void main(String[] args) {
//		generator();
//	}
//
//	/**
//	 * SQLServer 生成演示
//	 */
//	public static void generator() {
//		AutoGenerator mpg = new AutoGenerator();
//
//		// 全局配置
//		GlobalConfig gc = new GlobalConfig();
//		gc.setOutputDir("E://java_project//testes//src//main//java//com//testes");
//		gc.setFileOverride(true);
//		gc.setActiveRecord(true);
//		gc.setEnableCache(false);// XML 二级缓存
//		gc.setBaseResultMap(true);// XML ResultMap
//		gc.setBaseColumnList(false);// XML columList
//		gc.setAuthor("niuyibo");
//
//		// 自定义文件命名，注意 %s 会自动填充表实体属性！
//		gc.setMapperName("%sMapper");
//		gc.setXmlName("%sMapper");
//		// gc.setServiceName("MP%sService");
//		// gc.setServiceImplName("%sServiceDiy");
//		// gc.setControllerName("%sAction");
//		mpg.setGlobalConfig(gc);
//
//		// 数据源配置
//		DataSourceConfig dsc = new DataSourceConfig();
//		dsc.setDbType(DbType.MYSQL);
//		dsc.setTypeConvert(new MySqlTypeConvert());
//		dsc.setDriverName("com.mysql.jdbc.Driver");
//		dsc.setUsername("root");
//		dsc.setPassword("6May2019@");
//		dsc.setUrl("jdbc:mysql://106.13.90.178:3306/membership?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&transformedBitIsBoolean=true");
//		mpg.setDataSource(dsc);
//
//		// 策略配置
//		StrategyConfig strategy = new StrategyConfig();
//		// 全局大写命名 ORACLE 注意
//		strategy.setCapitalMode(true);
//		// 此处可以修改为您的表前缀
//		strategy.setTablePrefix(new String[] { "kypt_", "test_" });
//		// 表名生成策略
//		strategy.setNaming(NamingStrategy.underline_to_camel);
//		// 需要生成的表
//		strategy.setInclude(new String[] {"mem_position_0"});
//			
//		// strategy.setExclude(new String[]{"test"}); // 排除生成的表
//		// 自定义实体父类
//		// strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
//		// 自定义实体，公共字段
//		// strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
//		// 自定义 mapper 父类
//		strategy.setSuperMapperClass("com.testes.common.SuperMapper");
//		// 自定义 service 父类
//		strategy.setSuperServiceClass("com.baomidou.mybatisplus.service.IService");
//		// 自定义 service 实现类父类
//		strategy.setSuperServiceImplClass("com.baomidou.mybatisplus.service.impl.ServiceImpl");
//		// 自定义 controller 父类
//		//strategy.setSuperControllerClass("com.kypt.controller.BaseController");
//		// 【实体】是否生成字段常量（默认 false）
//		// public static final String ID = "test_id";
//		// strategy.setEntityColumnConstant(true);
//		// 【实体】是否为构建者模型（默认 false）
//		// public User setName(String name) {this.name = name; return this;}
//		// strategy.setEntityBuilderModel(true);
//		mpg.setStrategy(strategy);
//
//		// 包配置
//		PackageConfig pc = new PackageConfig();
//		pc.setParent("com.testes");
//		// pc.setModuleName("test");
//		pc.setMapper("mapper");
//		pc.setController("restController");
//		mpg.setPackageInfo(pc);
//
//		// 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
//		InjectionConfig cfg = new InjectionConfig() {
//			@Override
//			public void initMap() {
//				Map<String, Object> map = new HashMap<String, Object>();
//				map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
//				this.setMap(map);
//			}
//		};
//
//		// 自定义 entity 生成
//		List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
//		focList.add(new FileOutConfig("/template/tpl_entity.java.vm") {
//			@Override
//			public String outputFile(TableInfo tableInfo) {
//				// 自定义输入文件名称
//				return "E:\\java_project\\testes\\src\\main\\java\\com\\testes\\entity\\" + tableInfo.getEntityName() + "Entity.java";
//			}
//		});
//		cfg.setFileOutConfigList(focList);
//
//		// 调整 mapper 生成目录演示
//		focList.add(new FileOutConfig("/template/tpl_mapper.xml.vm") {
//			@Override
//			public String outputFile(TableInfo tableInfo) {
//				return "E:\\java_project\\testes\\src\\main\\resources\\mapper\\" + tableInfo.getEntityName() + "Mapper.xml";
//			}
//		});
//		cfg.setFileOutConfigList(focList);
//
//		// 调整 dao 生成目录演示
//		focList.add(new FileOutConfig("/template/tpl_mapper.java.vm") {
//			@Override
//			public String outputFile(TableInfo tableInfo) {
//				return "E:\\java_project\\testes\\src\\main\\java\\com\\testes\\mapper\\" + tableInfo.getEntityName() + "Mapper.java";
//			}
//		});
//		cfg.setFileOutConfigList(focList);
//		// 调整 service 生成目录演示
//		focList.add(new FileOutConfig("/template/tpl_service.java.vm") {
//			@Override
//			public String outputFile(TableInfo tableInfo) {
//				return "E:\\java_project\\testes\\src\\main\\java\\com\\testes\\service\\I" + tableInfo.getEntityName() + "Service.java";
//			}
//		});
//		cfg.setFileOutConfigList(focList);
//		// 调整 serviceImpl 生成目录演示
//		focList.add(new FileOutConfig("/template/tpl_serviceImpl.java.vm") {
//			@Override
//			public String outputFile(TableInfo tableInfo) {
//				return "E:\\java_project\\testes\\src\\main\\java\\com\\testes\\service\\impl\\" + tableInfo.getEntityName() + "ServiceImpl.java";
//			}
//		});
//		cfg.setFileOutConfigList(focList);
//		// 调整 controller 生成目录演示
//		focList.add(new FileOutConfig("/template/tpl_controller.java.vm") {
//			@Override
//			public String outputFile(TableInfo tableInfo) {
//				return "E:\\java_project\\testes\\src\\main\\java\\com\\testes\\restController\\" + tableInfo.getEntityName() + "Controller.java";
//			}
//		});
//		cfg.setFileOutConfigList(focList);
//		mpg.setCfg(cfg);
//		// 关闭默认 xml 生成，调整生成 至 根目录
//		TemplateConfig tc = new TemplateConfig();
//		tc.setXml(null);
//		tc.setController(null);
//		tc.setEntity(null);
//		tc.setMapper(null);
//		tc.setService(null);
//		tc.setServiceImpl(null);
//		mpg.setTemplate(tc);
//
//		// 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/template 下面内容修改，
//		// 放置自己项目的 src/main/resources/template 目录下, 默认名称一下可以不配置，也可以自定义模板名称
//		// TemplateConfig tc = new TemplateConfig();
//		// tc.setController("...");
//		// tc.setEntity("...");
//		// tc.setMapper("...");
//		// tc.setXml("...");
//		// tc.setService("...");
//		// tc.setServiceImpl("...");
//		// 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
//		// mpg.setTemplate(tc);
//
//		// 执行生成
//		mpg.execute();
//
//		// 打印注入设置【可无】
//		System.err.println(mpg.getCfg().getMap().get("abc"));
//	}
//
//}
