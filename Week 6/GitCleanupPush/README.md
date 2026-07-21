# Git Cleanup and Push to Remote

A demonstration project for cleaning up and pushing changes to remote Git repository.

## Steps

### 1. Verify master is clean
```bash
git status
```
Output: `On branch master, nothing to commit, working tree clean`

### 2. List all available branches
```bash
git branch -a
```

### 3. Pull remote repository to master
```bash
git pull origin master
```

### 4. Push pending changes to remote repository
```bash
git push origin master
```

### 5. Verify changes in remote repository
Login to GitLab/GitHub and verify the pushed files are reflected in the remote repository.

```bash
git log --oneline --graph --decorate
```

## Result

- Master is verified clean with no pending changes
- Remote repository is synced with local repository
- All changes from conflict resolution exercise are pushed to remote
