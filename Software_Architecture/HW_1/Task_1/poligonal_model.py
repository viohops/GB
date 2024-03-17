# poligonal_model.py
from model_elements import ModelElements

class Texture:
    pass

class Poligon:
    pass

class PoligonalModel(ModelElements):
    def init(self, textures):
        self.Poligons = []
        self.Textures = textures
        self.Poligons.append(Poligon(Point3D()))
