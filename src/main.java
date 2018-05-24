import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import java.applet.*;
import java.io.*;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class main  implements function<Double> {
    public static void main(String[] args) throws IOException,FileNotFoundException {
//        final double pi = Math.PI;
//        final Long long_integer = new Long(100);
//        boolean is_long = long_integer instanceof Long;
//        StringBuffer stringBuffer = new StringBuffer("Basic");
//        stringBuffer.append("al");
//        System.out.println(stringBuffer);
//        System.out.println(stringBuffer.insert(1,"_"));
//        BigInteger a = BigInteger.valueOf(long_integer);
//        a=a.add(BigInteger.valueOf(1));
//        System.out.println(a);
//        ArrayList<Double> fractions = new ArrayList<Double>(100);
//        fractions.ensureCapacity(100);
//        fractions.add(new Double(pi));
//        System.out.println(fractions.size());
//        fractions.set(0,2.0);
//        System.out.println(fractions.get(0));
//        for (Double d: fractions
//             ) {
//            System.out.println(d.floatValue());
//
//        }
//        HashMap<String, Double>hashMap = new HashMap<String, Double>();
//        hashMap.put("SQL", 95.0);
//        hashMap.put("XML WebService", 94.5);
//        System.out.println("SQL".hashCode());
//        System.out.println("S".hashCode());

        File file = new File("");
        System.out.println("Current path"+file.getAbsolutePath());

//        FileInputStream fileInputStream = new FileInputStream("test.txt");
//        byte[] buf = new byte[100];
//        int length = fileInputStream.read(buf);
//        System.out.println("The length of text.txt is: "+length);
//        String content = new String(buf,0,length, Charset.forName("utf-8")); //Important
//        System.out.println("The content of txt is: "+content);

//        System.out.println("------------Reader-----------------");
//        char []buf = new char[100];
//        InputStream inputStream = new FileInputStream("test.txt");
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,Charset.forName("utf-8"));
//
//        int reader_length = inputStreamReader.read(buf);
//        System.out.println("The length is:"+reader_length);
//        System.out.println(String.valueOf(buf,0,reader_length));
////        for (int i=0;i<reader_length;i++)
////        {
////            System.out.println("char ["+i+"] is "+buf[i]);
////        }
//
//        System.out.println("---------FileReader---------");
//        File txt_file = new File("test.txt");
//        FileReader  fileReader =  new FileReader(txt_file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String content_line = bufferedReader.readLine();
//        System.out.println(content_line);
        System.out.println("-----txt mode: PrintWriter--------");
        FileWriter fileWriter = new FileWriter("test.txt");
        writeData(fileWriter);


        System.out.println("----check file content-----");
        FileReader txt_content = new FileReader("test.txt");
        int content_length = txt_content.read();
        System.out.println("test.txt length:"+ content_length);

        try (Scanner scanner = new Scanner(new FileInputStream("test.txt"),"utf-8"))
        {
            reaData(scanner);
        }
//        System.out.println("txt content:"+txt_content.read);

        System.out.println("--------binary IO----------");

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("binaryIO.dat"));
        outputStream.writeInt(65);

        RandomAccessFile randomAccessFile = new RandomAccessFile("binaryIO.dat","r");
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("binaryIO.dat"));
        int ioInt = dataInputStream.readInt();
        System.out.println("binary content:"+ioInt);
    }

    private static void reaData(Scanner in){
        String line = in.nextLine();
        System.out.println(line);
    }

    private static void writeData(FileWriter fileWriter) throws IOException {
        PrintWriter printWriter = new PrintWriter(fileWriter,true); //autoFlush is indispensable
        String name = "Harry hacker lan";
        double salary = 7000;
        printWriter.print(name);
        printWriter.print(' ');
        printWriter.println(salary);

    }






    @Override
    public int getsize() {
        return 0;
    }

    @Override
    public void add(Double element) {


    }

    @Override
    public Double remove() {
        return null;
    }
}
