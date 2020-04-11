package jpaDemo.com.test;

import com.aliyun.oss.OSSClient;

import java.io.File;

/**
 * @Author haien
 * @Description 测试OSS文件上传
 * @Date 2018/11/18
 **/
public class OSSTest {

    /**
     * @Author haien
     * @Description 最懒模式上传文件
     * @Date 2018/11/18
     * @Param [args]
     * @return void
     **/
    public static void main(String[] args) {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维。这里用的就是RAM子账号。
        String accessKeyId = "LTAIhBhYwylDLuBA";
        String accessKeySecret = "6icLfaE1x3nTW5u3RNvFTxkzfhRKeO";

        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

        // 上传文件。<yourLocalFile>由本地文件路径加文件名包括后缀组成，例如/users/local/myfile.txt。
        ossClient.putObject("zhuzhuzai", "test", new File("d://puchijun.jpg"));

        // 关闭OSSClient。
        ossClient.shutdown();
    }

    /**
     * @Author haien
     * @Description 正常模式上传文件
     * @Date 2018/11/18
     * @Param [file, fileType]
     * @return void
     **/
    public void ossUploadFile(File file,String fileType){

    }
}
