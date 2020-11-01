In a party of N people, only one person is known to everyone. Such a person may be present in the party, if yes, (s)he doesn’t know anyone in the party. 

We can only ask questions like “does A know B? “. Find the stranger (celebrity) in the minimum number of questions.

We can describe the problem input as an array of numbers/characters representing persons in the party. We also have a hypothetical function HaveAcquaintance(A, B) which returns true if A knows B, false otherwise. 

How can we solve the problem.

**Example-1**:

**Input** : 

    MATRIX = { {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 0} }

**Output** :

    2
    
**Explanation**: The person with ID 2 does not know anyone but everyone knows him

**Example-2**:

**Input** : 

    MATRIX = { {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 1, 0, 0},
            {0, 0, 1, 0} }

**Output** :

    -1
