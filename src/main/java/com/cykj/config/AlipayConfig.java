package com.cykj.config;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: AlipayConfig
 * @Param:
 * @Author: BWL
 * @Date: 2021-07-26 23:13
 */

public class AlipayConfig {

	public static String app_id = "2021000117694176";

    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCgm/sLqI4z4L0ZhtOVNwMR2bQTnytrYbGdcWSzZeeen6qpM7+AN0QTWmpdyGXlSZK+v/zlm2+RDGXAQQg5NlZka4GcixnB8odBgXFwSlK4q+YpekaSqeozI4FHrpIN2o5NWN3JkToYBSgiQw+KCtp9ufZvlG+peieTgan2V/xMNh3XHZ7xBqX3w3Ej+1Tv+mtMQyJGUsbEWWqtYPgCExYCKE6O4DYeIoHg4I80W+nJ1uz1U+Dns0Zkiz3lKAxbslzeh98t2GIYb2Zt6Mzmdhd2PH5KOaDIpZ6DhGEb27JQKxPk1hqCnEMsg/JWtuv0d8HkcCaiAATqfWEa5gXpjxnnAgMBAAECggEATBI1MQtv9zBuQKX0l0tMH+tOeLC+PwkxuFHaEYKl1yLnEWdaP99tVgFQOgVOBfD4GXMT1KjvifMmSo5C195dwwiMhln4JD28RJGL6lS5o5B/3ot028ixDfG2LP6JXRh0qDv8KJmpu3DN1pSOyqJjZINtLuJOlSYvkpUqrGx2Kp4C8vxtOEhqn0n5UcEgOpKUuA98Hywkb82ndEVYcFxya8iW1ikFarujjpbHKYm9qpt0iEBhSGyD6qj6CAKSZVGO39eTIT67z+ymLrBIYp6yuKeUnbdJ1xRqMHZHdYEVfJlp4Bwsg94iUveR5tRTs7RlSHtEWJlDiqZmtZeXCEYpYQKBgQDUGbu5/U2Zfoc1B1jCNP/79tzc7TW/yZgQgekxmjUSuNS5Rj2K5k2jyLyHyq8G4l34Dr+8cV3cAVLxHHWy4Un9jwmsm92A5RX7u3YTzZbktQl70W+xL8YLN7CeT6CMqy4dKlQtIWkWkOnRD+WUi2DOPHaxBM/BBdbC0/20lurxdwKBgQDB2fSot5qkadMeqdsO3nvdBhOf55sH0jhB8tHejkqrweh44fFobSg8VSq8ZvzQ7CoDgkLQFDXs1NeFqA7FphXEZp9eKouXkqIU5A8njViE9Z2eUN+UgzS5nQ7Nj+YLciUuZpm9afP5hisoRnHZ+q8lGU+C/fSlNdg2tZC8Z6+3EQKBgQCMOKMKV/M4ehTrMvs0EZP2wQLNMCmrrJxStYA0oc1ankVMY6qGLLHBiRFS+OVzuK4FM8MA0zYJH/r0misZ4qVm82yi57yt3UYGUa3Dc9TBSQqHCDQ+QOY+PkgOsXfj57up3nUeDQuLtqxN4aOW6/pI/mI9r3+mDbUowrvk6y1SCwKBgCC1V/TH1g371SWNX2ro21l11wXaHGx7agampAa7V5oXg9Qxu3v1Px6++BEGB45w6r3g0sktP9QQLbVdn/B1j6Kt9iH7Z8ZRdYu012HDFbaJgujdmHwEj3bqKz9AEn7H6cIkibhOEl595vZKvJcdF0RZOvNNSmQ965d/l0ZS8HEhAoGAbFV3gIq9WFXYoQXp02xEB1y7f0zstT2lrdMqu0ydi58pp7KHvS6ciHDYaL7fEKbhrAtn0XujcP5NWjpOrBfb1FqijHC0QscHuJ/6twl0t1KUrosm0z1jPFo1CrdYKaq1LwfOpNWgI3Oi4Wei5dz8iFGR/tbbDsm2w9YJeE1frZ8=";

    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoJv7C6iOM+C9GYbTlTcDEdm0E58ra2GxnXFks2Xnnp+qqTO/gDdEE1pqXchl5UmSvr/85ZtvkQxlwEEIOTZWZGuBnIsZwfKHQYFxcEpSuKvmKXpGkqnqMyOBR66SDdqOTVjdyZE6GAUoIkMPigrafbn2b5RvqXonk4Gp9lf8TDYd1x2e8Qal98NxI/tU7/prTEMiRlLGxFlqrWD4AhMWAihOjuA2HiKB4OCPNFvpydbs9VPg57NGZIs95SgMW7Jc3offLdhiGG9mbejM5nYXdjx+SjmgyKWeg4RhG9uyUCsT5NYagpxDLIPyVrbr9HfB5HAmogAE6n1hGuYF6Y8Z5wIDAQAB";

	public static String notify_url = "http://localhost:8080/Alipay";

	public static String return_url = "http://localhost:8080/Alipay";

	public static String sign_type = "RSA2";

	public static String charset = "utf-8";

	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	public static String log_path = "C:\\";


    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

