package cc.implicated.config.path;

import lombok.SneakyThrows;
import org.springframework.util.Assert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/15/22 10:27
 */
public class MavenPath {
    @SneakyThrows
    public static void main(String[] args) {
        getPath();

        getFileVSgetPath();

        readFile();
    }

    private static void readFile() {
        try (InputStream inputStream = MavenPath.class.getResourceAsStream("/config/11.md")) {
            Assert.notNull(inputStream, "input stream is null!");
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.println(i);
            }
            InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    private static void getPath() {
        System.out.println("getResource");
        System.out.println(MavenPath.class.getResource(""));
        System.out.println(MavenPath.class.getClassLoader().getResource(""));
        System.out.println(MavenPath.class.getResource("/"));

        System.out.println("getPath");
        System.out.println(MavenPath.class.getResource("").getPath());
        System.out.println(MavenPath.class.getClassLoader().getResource("").getPath());
        System.out.println(MavenPath.class.getResource("/").getPath());

        System.out.println("getFile");
        System.out.println(MavenPath.class.getResource("").getFile());
        System.out.println(MavenPath.class.getClassLoader().getResource("").getFile());
        System.out.println(MavenPath.class.getResource("/").getFile());
        System.out.println();
    }

    private static void getFileVSgetPath() throws MalformedURLException {
        URL url = new URL("https://www.baidu.com/img/baidu_jgylogo3.gif?param=1111&param2=aaaaa");
        System.out.println(url.getFile());
        System.out.println(url.getPath());
        System.out.println();
    }

}
