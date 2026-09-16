package net.majid.structural.composite;

public class Test {
    public static void main(String[] args) {

        File file1 = new File(10);
        File file2 = new File(20);

        Directory pictures = new Directory();

        pictures.add(new File(5));
        pictures.add(new File(7));


        Directory documents = new Directory();

        documents.add(file1);
        documents.add(file2);
        documents.add(pictures);

        System.out.println(documents.getSize());
    }
}
