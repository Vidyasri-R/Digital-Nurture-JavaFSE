# Git Conflict Resolution Demo

A demonstration project for learning how to resolve merge conflicts in Git.

## Steps

### 1. Verify master is clean
```bash
git status
```

### 2. Create branch and add file
```bash
git branch GitWork
git checkout GitWork
echo "<hello>This is from branch</hello>" >> hello.xml
```

### 3. Stage and observe status
```bash
git add hello.xml
git status
```

### 4. Commit changes to branch
```bash
git commit -m "Added hello.xml in GitWork branch"
```

### 5. Switch to master
```bash
git checkout master
```

### 6. Add same file with different content in master
```bash
echo "<hello>This is from master</hello>" >> hello.xml
```

### 7. Commit changes to master
```bash
git add hello.xml
git commit -m "Added hello.xml in master"
```

### 8. Observe the log
```bash
git log --oneline --graph --decorate --all
```

### 9. Check differences
```bash
git diff master GitWork
```

### 10. Visual differences using P4Merge
```bash
git difftool master GitWork
```

### 11. Merge branch to master
```bash
git merge GitWork
```

### 12. Observe the conflict markup
```bash
cat hello.xml
```
The file will contain conflict markers:
```
<<<<<<< HEAD
<hello>This is from master</hello>
=======
<hello>This is from branch</hello>
>>>>>>> GitWork
```

### 13. Resolve conflict using 3-way merge tool
```bash
git mergetool
```

### 14. Commit after resolving conflict
```bash
git add hello.xml
git commit -m "Resolved merge conflict in hello.xml"
```

### 15. Add backup files to .gitignore
```bash
echo "*.orig" >> .gitignore
git add .gitignore
```

### 16. Commit .gitignore
```bash
git commit -m "Added backup files to .gitignore"
```

### 17. List all branches
```bash
git branch -a
```

### 18. Delete the merged branch
```bash
git branch -d GitWork
```

### 19. Observe the final log
```bash
git log --oneline --graph --decorate
```

## Result

- Conflict was created when same file was modified in both master and branch
- Conflict was resolved using 3-way merge tool
- Backup files were added to .gitignore
- Branch was deleted after successful merge
