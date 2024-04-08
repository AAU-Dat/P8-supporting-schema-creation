# Supervisor Meeting 8
Date: 2024-04-08
Time: 09:00

## Missing Attendees
- None

## Agenda
1. In the subsection: Function definitions, we have written the functions we use to define our abstract semantics. Currently, some of them are quite wordy, is that alright?
   1. Is the proof of theorem 6 convincing?
   2. For step <1>3. is quite intuitive to see that the cover lattice is finite, yet it's a bit awkward to prove.
2. Essentially we are trying to prove that the function f(X) = {x u x', x n x', x | x, x' in X} converges after a finite number of steps.
3. We are using the abstract semantics from another paper as the basis for our analysis, but are making small changes to it. To what degree should we explain the semantics? Should we explain all of it? or just justify our changes?
4. We don't think we need to prove that our analysis functions are monotone, we have two reasons: The analysis lattices we are dealing with are of finite size thus our analysis will eventually exhaust the state space and terminate, and our semantics are operational and thus well-defined without needing to prove that the analysis functions are monotone. Do you agree with this assessment?
5. Are you expecting a demonstration of the program for the exam?


## Meeting Notes
Exam date 25th of June

Make the presentation of the section *function definitions* more homogenous and consistent.
Maybe move the contents to preliminaries/notation.
Maybe as a table instead of some heterogeneous text.

Proof of theorem 6
Change names of X because it's not a lattice.

Regarding question 3 of the agenda: Only include the modified parts where the original proofs from (Abstract interpretation of queries) are invalidated. Otherwise, reference their paper.

We need to show the functions are monotone if we need it for the semantics. (Related to Galois connection?)

If among our contributions there is a working system, we need to show a demonstration.

Next meeting Monday 2024-04-15 09:00

## Action items
*These action items should be written on the GitHub project board*

##### Group
- [ ] Send invite to next meeting
- [ ] Discuss question 4 again and send a mail about it later today

##### Supervisor
- [ ]  