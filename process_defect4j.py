from data_utils import load_data
import os


def get_all_unique_method(directory, project):
    bug_list = load_data(directory)
    all_methods = list()
    for b in bug_list:
        b_dir = "./data_defect4j/preprossed_method_corpus/%s/%s/document.index" % (project, b)
        method_list = load_data(b_dir)
        all_methods += method_list
    all_methods = set(all_methods)
    all_paths = [m.split("\t")[0] for m in all_methods]
    all_names = [m.split("\t")[1].strip() for m in all_methods]
    all_dict = {}
    for i in range(0, len(all_paths)):
        if all_names[i] in all_dict:
            # append the new number to the existing array at this slot
            all_dict[all_names[i]].append(all_paths[i])
        else:
            # create a new array in this slot
            all_dict[all_names[i]] = [all_paths[i]]
    return all_dict


def get_all_method(directory, project):
    bug_list = load_data(directory)
    all_methods = list()
    all_projects = list()
    for b in bug_list:
        b_dir = "./data_defect4j/preprossed_method_corpus/%s/%s/document.index" % (project, b)
        method_list = load_data(b_dir)
        all_methods += method_list
        all_projects += [b] * len(method_list)
    all_paths = [m.split("\t")[0] for m in all_methods]
    all_dict = {}
    for i in range(0, len(all_paths)):
        all_dict[all_paths[i]] = all_projects[i]
    return all_dict


def write_file(directory, data):
    if not os.path.exists(os.path.dirname(directory)):
        try:
            os.makedirs(os.path.dirname(directory))
        except OSError:
            print "Can't create directory"
    with open(directory, "w") as f:
        [f.write(d +"\n") for d in data if len(d.strip()) > 0]
    f.close()


def combined_method_text(projects):
    for p in projects:
        dir_ = "./data_defect4j/bug_list/%s_bug_list.txt" % p
        unique_method = get_all_unique_method(directory=dir_, project=p)
        all_method = get_all_method(directory=dir_, project=p)
        sorted_names = sorted(unique_method.iterkeys())
        # for i in xrange(len(sorted_names)):
        #     name = sorted_names[i]
        #     name_paths = unique_method[name]
        #     bug_reports = [all_method[n] for n in name_paths]
        #     method_contain = []
        #     for bug, name_path in zip(bug_reports, name_paths):
        #         dir_method = "./data_defect4j/preprossed_method_corpus/%s/%s/%s" % (p, bug, name_path)
        #         method_contain += load_data(dir_method)
        #     output = "./data_defect4j/combined_method_text/%s/%i.txt" % (p, i)
        #     write_file(output, set(method_contain))
        output = "./data_defect4j/combined_method_text/%s_index.txt" % p
        write_file(output, sorted_names)


def method_list(projects):
    for p in projects:
        dir_ = "./data_defect4j/bug_list/%s_bug_list.txt" % p
        bug_list = load_data(filename=dir_)
        for b in bug_list:
            b_dir = "./data_defect4j/preprossed_method_corpus/%s/%s/document.index" % (p, b)
            methods = load_data(b_dir)
            names = [m.split("\t")[1].strip() for m in methods]
            output = "./data_defect4j/method_list/%s/%s.txt" % (p, b)
            write_file(output, names)


if __name__ == "__main__":
    projects_ = ["Lang", "Math", "Time"]
    combined_method_text(projects_)
    # method_list(projects=projects_)

    # if len(d.strip()) > 0
