package repository;

import models.FirstAidKit;

public interface FirstAidKitRepository {
    void create();

    FirstAidKit get();

    void delete();

    void update();
}
