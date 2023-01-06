from django.db import models

# Create your models here.

class Language(models.Model):
    name = models.CharField(max_length=255)
    votes = models.IntegerField(default=0)
