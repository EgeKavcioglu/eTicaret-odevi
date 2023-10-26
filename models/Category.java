package eTicaret.models;

public class Category {
    private String categoryName;

    private int categoryId;

    public Category(String kırtasiye, int i) {

    }
    public String getCategoryName() {
        this.categoryName = categoryName;
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}