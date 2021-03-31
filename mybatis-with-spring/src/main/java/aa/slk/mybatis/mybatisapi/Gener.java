//package aa.slk.mybatis.mybatisapi;
//
//import org.mybatis.generator.api.MyBatisGenerator;
//import org.mybatis.generator.config.Configuration;
//import org.mybatis.generator.config.xml.ConfigurationParser;
//import org.mybatis.generator.exception.InvalidConfigurationException;
//import org.mybatis.generator.exception.XMLParserException;
//import org.mybatis.generator.internal.DefaultShellCallback;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Gener {
//    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
//        List<String> warnings = new ArrayList<>();
//
//        boolean override = true;
//        InputStream resourceAsStream = Gener.class.getResourceAsStream("/MBG.XML");
//        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
//        Configuration configuration = configurationParser.parseConfiguration(resourceAsStream);
//        resourceAsStream.close();
//        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(override);
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, defaultShellCallback, warnings);
//        myBatisGenerator.generate(null);
//        for (String object : warnings) {
//            System.out.println(object);
//        }
//    }
//}
