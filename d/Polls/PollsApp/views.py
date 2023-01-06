from django.shortcuts import render, redirect, HttpResponse
from PollsApp.models import Language

# Create your views here.
def index(req):
    obj = Language.objects.all()
    return render(req, 'index.html', {'languages': obj})

def vote(req):
    id = req.POST.get('language')
    try:
        obj = Language.objects.get(pk=id)
    except:
        return HttpResponse("please select language")
    obj.votes = obj.votes + 1
    obj.save()
    return redirect('/')
