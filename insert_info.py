import os
import re

directory = r'c:\Users\ADITYA\Desktop\MITS\4thsem\JAVA'
target_line = 'System.out.println("ADITYA KUMAR SINGH"+"\\n"+"BTAD24O1005");'

java_files = [f for f in os.listdir(directory) if f.endswith('.java')]

for file_name in java_files:
    file_path = os.path.join(directory, file_name)
    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()

    if target_line in content:
        continue

    main_pattern = re.compile(r'(public\s+static\s+void\s+main\s*\([^)]*\)\s*\{)', re.MULTILINE)
    
    match = main_pattern.search(content)
    if match:
        insertion_point = match.end()

        line_start = content.rfind('\n', 0, match.start()) + 1
        indentation = ''
        for char in content[line_start:match.start()]:
            if char.isspace():
                indentation += char
            else:
                break
        
        inner_indentation = indentation + '    '
        new_content = content[:insertion_point] + '\n' + inner_indentation + target_line + content[insertion_point:]
        
        with open(file_path, 'w', encoding='utf-8') as f:
            f.write(new_content)
        print(f"Inserted into {file_name}")
    else:
        pass
