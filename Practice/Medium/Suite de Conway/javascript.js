var R = parseInt(readline());
var L = parseInt(readline());

ligneSuiv = (ligne) => {
    let suiv = []
    let lastC = ligne[0]
    let cpt = 0
    for (let c of ligne) {
        if (c == lastC) {
            cpt++
        }
        else {
            suiv.push(cpt.toString())
            suiv.push(lastC)
            lastC = c
            cpt = 1
        }
    }
    suiv.push(cpt.toString())
    suiv.push(lastC)
    return suiv
}

conway = (seed, size) => {
    let ligne = [seed.toString()];
    for (let i = 0; i < size; i++) {
        ligne = ligneSuiv(ligne)
    }
    ligne.length > 1 ? print(ligne.join(" ")) : print(ligne)
}

conway(R, L-1);
