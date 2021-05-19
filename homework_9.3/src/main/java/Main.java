import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String source = "G:\\SkillGit16.05\\Skill\\homework_9.3\\src\\test\\resources\\movementList.csv";

    static String withoutS(FStr fs, String s) {
        return fs.func(s);
    }

    public static void main(String[] args) {
        Movements movements = new Movements();
        String line = null;

        File file = new File(source);
        String[] strings = new String[0];


        Pattern pattern = Pattern.compile("([0-9]{2,5}\\.[0-9]{2})");
        Pattern patternCount = Pattern.compile("([0-9]{20})");
        Pattern patternCosts = Pattern.compile("([0-9]{1,5}\\,[0-9]{0,2})");

        BufferedReader reader = null;
        FileReader fr = null;

        FileWriter fw = null;
        BufferedWriter writer = null;

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Double> count = new ArrayList<>();
        ArrayList<String> costs = new ArrayList<>();

        int m = 0;

        try {
            fr = new FileReader(file);
            reader = new BufferedReader(fr);

            while ((line = reader.readLine()) != null) {
                strings = line.split("\\t");
                Matcher matcher = pattern.matcher(line);
                Matcher matcherCount = patternCount.matcher(line);
                Matcher matcherCosts = patternCosts.matcher(line);

                while (matcher.find()){
                    m++;
                    if (Double.valueOf(matcher.group()) > 32){
                       count.add (Double.valueOf(matcher.group()));
                    }
                }
                while (matcherCount.find()){
                    movements.setNameCompany(matcherCount.group());
                }
                while (matcherCosts.find()){
                    costs.add(matcherCosts.group());
                }


                for (int i = 0; i < strings.length; i++) {
                    fw = new FileWriter(String.valueOf(list.add(strings[i])), true);
                   
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

        movements.setComing(count);
        movements.setCosts(costs);
        System.out.println(movements.toString());
    }
}
