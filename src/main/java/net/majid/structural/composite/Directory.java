package net.majid.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystemComponent {

    private final List<FileSystemComponent> children = new ArrayList<>();

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public int getSize() {

        return children.stream()
                .mapToInt(FileSystemComponent::getSize)
                .sum();
    }
}
