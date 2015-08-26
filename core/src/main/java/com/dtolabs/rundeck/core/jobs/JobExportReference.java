package com.dtolabs.rundeck.core.jobs;

import com.dtolabs.rundeck.plugins.scm.JobSerializer;

/**
 * A reference which also has a serializer
 */
public interface JobExportReference extends JobRevReference {

    JobSerializer getJobSerializer();
}
