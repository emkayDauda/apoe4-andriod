package hng.tech.apoe_4.daos;

import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

import java.util.List;

import hng.tech.apoe_4.models.QuestionAnswerChat;

public interface ChatDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertSingleElement(QuestionAnswerChat questionAnswerChat);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMultipleElements(List<QuestionAnswerChat> questionAnswerChats);
}