import sys
import math

r = int(raw_input())
l = int(raw_input())

def ligneSuiv(ligne):
    suiv = []
    lastC = ligne[0]
    cpt = 0
    for c in ligne:
        if c == lastC:
            cpt += 1
        else:
            suiv.append(str(cpt))
            suiv.append(lastC)
            lastC = c
            cpt = 1
    suiv.append(str(cpt))
    suiv.append(lastC)
    return suiv

def conway(seed, size):
    ligne = [str(seed)]
    for i in range(0, size):
        ligne = ligneSuiv(ligne)
    print ("".join(ligne), " ".join(ligne))[len(ligne) > 1]
conway(r, l-1)
