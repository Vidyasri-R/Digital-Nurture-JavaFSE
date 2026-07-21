# GitIgnore Demo

A demonstration project for learning .gitignore in Git.

## Objective

Create a `.log` file and a `log` folder in the working directory. Update `.gitignore` to ignore `.log` extensions and `log` folders on committing.

## Steps

1. Create a `.log` file in the working directory
```bash
echo "This is a log file" >> debug.log
```

2. Create a `log` folder with a file inside
```bash
mkdir log
echo "Log entry" >> log/app.log
```

3. Create `.gitignore` file with the following content
```
*.log
log/
```

4. Check git status
```bash
git status
```
The `.log` file and `log/` folder will not appear in untracked files.

5. Verify only `.gitignore` and `README.md` are tracked
```bash
git add .
git commit -m "Added gitignore to ignore log files and folders"
git push origin master
```

## Result

- `debug.log` is ignored
- `log/` folder and its contents are ignored
- Only `.gitignore` and `README.md` are committed
