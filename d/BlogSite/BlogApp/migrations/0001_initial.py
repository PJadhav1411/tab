# Generated by Django 4.1.4 on 2022-12-31 09:02

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Post',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('title', models.CharField(max_length=255)),
                ('slug', models.SlugField()),
                ('content', models.TextField()),
                ('date_time', models.DateTimeField(auto_now_add=True)),
            ],
        ),
    ]
