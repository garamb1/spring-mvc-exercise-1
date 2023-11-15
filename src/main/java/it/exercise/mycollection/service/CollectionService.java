package it.exercise.mycollection.service;

import it.exercise.mycollection.model.Platform;
import it.exercise.mycollection.model.VideoGame;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CollectionService {

    private final Map<Integer, VideoGame> collection = new HashMap<>();
    private int nextId = 4;

    public CollectionService() {
        collection.put(1, new VideoGame("EA FC 24", "EA", "2023", Platform.PS4));
        collection.put(2, new VideoGame("The Legend of Zelda: Tears of the Kingdom", "Nintendo", "2023", Platform.SWITCH));
        collection.put(3, new VideoGame("GTA V", "Rockstar Games", "2013", Platform.PS4));
    }

    public Map<Integer, VideoGame> getCollection() {
        return collection;
    }

    public void add(VideoGame game) {
        collection.put(nextId++, game);
    }

    public void remove(int gameId) {
        collection.remove(gameId);
    }

}
