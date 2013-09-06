package hudson.plugins.jobConfigHistory;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Comparator for {@link ConfigInfo}, sort order depends on {@link ConfigInfo#parsedDate()}.
 *
 * Sort in descending order.
 *
 * @author mfriedenhagen
 */
@SuppressWarnings("serial")
final class ConfigInfoComparator implements Comparator<ConfigInfo>, Serializable {

    /**
     * No need to create more than one instance.
     */
    public static final ConfigInfoComparator INSTANCE = new ConfigInfoComparator();

    /** {@inheritDoc} */
    public int compare(final ConfigInfo ci1, final ConfigInfo ci2) {
        return ci2.parsedDate().compareTo(ci1.parsedDate());
    }
}