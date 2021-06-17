package repository;

import models.FirstAidKit;

public interface FirstAidKitRepository {
    void create(FirstAidKit firstAidKit);

    FirstAidKit get();

    void delete();

    void update();
}
