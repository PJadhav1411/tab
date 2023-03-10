from django.db import models

# Create your models here.
class Post(models.Model):
    title = models.CharField(max_length=255)
    slug = models.SlugField()
    content = models.TextField()
    date_time = models.DateTimeField(auto_now_add=True)
