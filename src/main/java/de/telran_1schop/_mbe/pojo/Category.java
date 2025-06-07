    package de.telran_1schop._mbe.pojo;

    import lombok.*;
    import org.springframework.stereotype.Component;

    import java.util.Objects;

    @Component

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @ToString

//    @Data

    public class Category {

        private Long categoryId;
        private String name;




//    private Integer categoryId;
//
//    private String name;
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Category category = (Category) o;
//        return Objects.equals(categoryId, category.categoryId) && Objects.equals(name, category.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(categoryId, name);
//    }
//
//    @Override
//    public String toString() {
//        return "Category{" +
//                "categoryId=" + categoryId +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    public Integer getCategoryId() {
//        return categoryId;
//    }
//
//    public void setCategoryId(Integer categoryId) {
//        this.categoryId = categoryId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Category(Integer categoryId, String name) {
//        this.categoryId = categoryId;
//        this.name = name;
//    }
//
//    public Category() {
    }

