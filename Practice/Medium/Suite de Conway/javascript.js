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

conway = (n) => {
    let ligne = [R.toString()];
    for (let i = 0; i < n; i++) {
        ligne = ligneSuiv(ligne)
    }
    print(ligne.length > 1 ? ligne.join(" ") : ligne)
}

conway(L-1);
