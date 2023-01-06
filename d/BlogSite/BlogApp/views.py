from django.shortcuts import render
from BlogApp.models import Post
# Create your views here.
def front(request):
    obj = Post.objects.all()
    return render(request, 'front.html', {'post':obj})

def post_detail(request, slug):
    obj = Post.objects.get(slug=slug)
    return render(request, 'post_detail.html', {'post': obj})
