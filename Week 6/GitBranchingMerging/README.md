# Git Branching and Merging Demo

A demonstration project for learning Git branching and merging.

## Branching

1. Create a new branch
```bash
git branch GitNewBranch
```

2. List all local and remote branches
```bash
git branch -a
```

3. Switch to the newly created branch
```bash
git checkout GitNewBranch
```

4. Add a file with content
```bash
echo "This file is created in GitNewBranch" >> branchfile.txt
```

5. Stage and commit the changes
```bash
git add branchfile.txt
git commit -m "Added branchfile.txt in GitNewBranch"
```

6. Check status
```bash
git status
```

## Merging

1. Switch to master
```bash
git checkout master
```

2. List differences between master and branch
```bash
git diff master GitNewBranch
```

3. List visual differences using P4Merge
```bash
git difftool master GitNewBranch
```

4. Merge the branch to master
```bash
git merge GitNewBranch
```

5. Observe the log after merging
```bash
git log --oneline --graph --decorate
```

6. Delete the branch after merging
```bash
git branch -d GitNewBranch
```

7. Verify branch is deleted
```bash
git branch -a
```

## Result

- Branch `GitNewBranch` was created and a file was added
- Changes were merged into `master`
- Branch was deleted after successful merge
