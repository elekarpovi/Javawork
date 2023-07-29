import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader; 
import java.util.List;

public interface Json_service {
    static void saveJson(List<Toy> toys) {
        String fileName = "Toys.json";
        String fileBody = castToyToJson(toys);

        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(fileBody);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    private static String castToyToJson(List<Toy> toys) {
        StringBuilder fileBody = new StringBuilder();
        fileBody.append("[\n");
        int count = 1;
        for ( Toy toy :toys){
            fileBody.append("\t{\n");
            fileBody.append("\t\t\"toy_id\":\"").append(toy.getToy_id()).append("\",\n");
            fileBody.append("\t\t\"name\":\"").append(toy.getName()).append("\",\n");
            fileBody.append("\t\t\"volume\":").append(toy.getVolume()).append(",\n");
            fileBody.append("\t\t\"frequency\":").append(toy.getFrequency()).append("\n");
            if (count < toys.size()) { fileBody.append("\t},\n");}
            else { fileBody.append("\t}\n");}
            count++;
        }
        fileBody.append("]\n");
        return fileBody.toString();
    }
}