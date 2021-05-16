import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String source = "G:\\06.03.SkillBox\\java_basics\\09_FilesAndNetwork\\homework_9.3\\src\\test\\resources\\movementList.csv";
    static String withoutS(FStr fs, String s){
        return fs.func(s);
    }
    public static void main(String[] args) {
        String line = null;

        File file = new File(source);
        String[] strings = new String[0];

        ArrayList<String> list1 = new ArrayList<>();
        Pattern pattern = Pattern.compile("([0-9]{2,5}\\.[0-9]{2})");

        BufferedReader reader = null;
        FileReader fr = null;

        FileWriter fw = null;
        BufferedWriter writer = null;

        ArrayList<String> list = new ArrayList<>();

        try {
            fr = new FileReader(file);
            reader = new BufferedReader(fr);

            while ((line = reader.readLine()) != null) {
                strings = line.split("\\t");

                for (int i = 0; i < strings.length; i++) {
                    fw = new FileWriter(String.valueOf(list.add(strings[i])), true);
                    if (strings[i].contains(pattern.pattern())) {

                    }
                    writer = new BufferedWriter(fw);
                    writer.write(line);
                    writer.newLine();
                    writer.flush();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Exception read file" + e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        list.stream().forEach(System.out::println);
//        System.out.println("*********");
//        String s = list.get(1);
//
//
//        String out;
//        out = withoutS((str) -> {
//            String result = "";
//            int i;
//            for (i = 0; i < str.length(); i ++){
//                if (str.charAt(i) !=' '){
//                    result += str.charAt(i);
//                }
//            }
//            return result;
//        },s);
//


//        System.out.println(out);
        System.out.println(list1.size());
    }
}
