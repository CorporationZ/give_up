package school.maang.telegrambot;


import lombok.*;

@Data
@AllArgsConstructor
public class Products {
    private int id;
    private String name;
    private String description;
    private String image;
    private float kg;
    private double price;
}
