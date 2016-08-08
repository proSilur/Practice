import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class MyFile {
    public static void main(String[] args) {
        getFolderReport("D:\\Progs\\Idea\\WorkWithFile\\folder", "word.txt");
    }

    static String getFileInfo(File file) {
        SimpleDateFormat format = new SimpleDateFormat("dd:MM:yyyy");
        String result = String.format("%-20.20s\t%-6.6s\t%12.12s\t%10.10s", file.getName(), (file.isFile()) ? "File" : "Folder",
                "" + file.length(), format.format(file.lastModified()));
        return result;
    }

    public static boolean checkFolderExist(File folder) {
        return (folder.exists() && folder.isDirectory());
    }

    public static String getFolderInfo(File folder) {
        StringBuilder builder = new StringBuilder();
        File[] files = folder.listFiles();
        for (File file : files) {
            builder.append(getFileInfo(file));
            builder.append(System.lineSeparator());
        }
        return builder.toString();
    }

    private static String getHeader() {
        String result = String.format("%-20.20s\t%-6.6s\t%12.12s\t%10.10s", "Name", "Type", "Size", "Date");
        return result + System.lineSeparator();
    }

    private static void saveTextToFile(String text, File file) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
        }
    }

    private static void getFolderReport(String folderAddress, String fileAddress) {
        File folder = new File(folderAddress);
        if (!checkFolderExist(folder)) {
            return;
        }
        String text = getHeader() + getFolderInfo(folder);
        File file = new File(fileAddress);
        saveTextToFile(text, file);
        System.out.println("Done!");
    }
}
