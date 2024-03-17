# scene.py
from camera import Camera

class Scene(Camera):
    pass
        def init(self, id, models, flashes, cameras):
            self.ID = id
            if len(models) > 0:
            self.Models = models
            else:
            raise Exception("Должна быть одна модель")
            self.Flashes = flashes
            if len(cameras) > 0:
            self.cameras = cameras
            else:
            raise Exception("Должна быть одна камера")