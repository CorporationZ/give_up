package school.maang.qurstion_game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class QuestionModel {
    private int id;
    private String question;
    private String answer;
    private List<String> variants;
}
