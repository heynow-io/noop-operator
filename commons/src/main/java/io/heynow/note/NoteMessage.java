package io.heynow.note;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class NoteMessage implements Serializable {
    private Note note;
    private List<String> path;
}
