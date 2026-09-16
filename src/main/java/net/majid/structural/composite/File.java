package net.majid.structural.composite;

class File implements FileSystemComponent {

    private final int size;

    public File(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
