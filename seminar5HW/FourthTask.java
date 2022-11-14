package seminar5HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourthTask {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> contentToPathMap = new HashMap<>();

        for (String path : paths) {

            String[] files = path.split(" ");
            String folder = files[0];

            for (int i = 1; i < files.length; i++) {
                String fileContent = files[i];
                String name = fileContent.split("\\(")[0];
                String content = fileContent.split("\\(")[1];

                List<String> filesPaths = contentToPathMap.getOrDefault(content, new ArrayList<String>());
                filesPaths.add(folder + "/" + name);
                contentToPathMap.put(content, filesPaths);
            }

        }

        List<List<String>> output = new ArrayList<List<String>>();

        for (List<String> p : contentToPathMap.values()) {
            if (p.size() > 1)
                output.add(p);
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(
                new FourthTask().findDuplicate(new String[] { 
                                                    "root/a 1.txt(abcd) 2.txt(efgh)", 
                                                    "root/c 3.txt(abcd)",
                                                    "root/c/d 4.txt(efgh)", 
                                                    "root 4.txt(efgh)" }));
        System.out.println(
                new FourthTask().findDuplicate(new String[] { 
                                                    "root/a 1.txt(abcd) 2.txt(efgh)", 
                                                    "root/c 3.txt(abcd)",
                                                    "root/c/d 4.txt(efgh)"}));

    }
}
