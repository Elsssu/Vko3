package main;

public class Vault {
    private String content;

    public Vault(String content) {
        this.content = content;
        
    }

    public void printSpecs() {
        System.out.println(content);

    }
}
