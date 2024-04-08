# Supervisor Meeting 6
Date: 2024-03-18
Time: 09:02

## Missing Attendees
None

## Agenda
- **Objective**
    - The objective is to present the current progress and access the proposed solutions.
- **We have decided that the interface is going to be a CLI**
    - For now, we will integrate the CLI directly with the analysis backend.
- **We have finalized the MoSCoW, do you have any comments?** (10 min)
    - Lead: Daniel
    - Preparation: Read the new MoSCoW provided below.
- **We are currently working on the analysis lattices, we have abstract strings figured out, and abstract reals and numbers should be done shortly. When this is done we can start work on the analysis functions.**
- **In Relation to our progress on the analysis section IV and V have been produced, do they make sense so far (they are works in progress), and do the related proofs in the appendices make sense?** (10 minutes)
    - Lead: Casper
    - Preparation: Read the attached draft of the paper.
- **What are your thoughts on the introduction** (5 min)
    - Lead: Sebastian
    - Preparation: Read the attached draft of the paper.
- **For (I)LP solvers we have decided to use Google OR tools and dk.brics.automaton for regular expression.**
    - Lead: Anders
    - Preparation: None.

### Meeting notes
Infinite union -> Regular expressions are not closed under infinite union, but we have solutions, for example using only finite length languages/words.

Gabriela: Are the restrictions on the abstractions relevant for the user of the system.
- Is the problem too complex to calculate?

Casper: The restriction is a nice one, because it shields the user from ...?

Lars: Bring up both solutions and compare them.

Mail will be sent thursday, not friday this week.

Gabriela: Please send the material earlier than 15:00.

## Action items
*These action items should be written on the GitHub project board*

##### Group
- [x] Send invite to next meeting
- [ ] Add section in article on notation. Possibly in abstract
- [ ] Example of "Why what we do is relevant"

##### Supervisor
None