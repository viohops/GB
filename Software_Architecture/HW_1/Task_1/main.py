# main.py
from model_elements import ModelElements
from poligonal_model import Texture, Poligon, PoligonalModel
from model_store import ModelStore
from flash import Flash
from camera import Camera
from scene import Scene

# Пример использования
model_elements_instance = ModelElements()
texture_instance = Texture()
poligon_instance = Poligon()
poligonal_model_instance = PoligonalModel(texture_instance, poligon_instance)
model_store_instance = ModelStore()
flash_instance = Flash()
camera_instance = Camera()
scene_instance = Scene()
