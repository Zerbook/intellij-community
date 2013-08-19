package org.jetbrains.idea.svn.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.idea.svn.SvnVcs;
import org.jetbrains.idea.svn.add.SvnKitAddClient;
import org.jetbrains.idea.svn.delete.SvnKitDeleteClient;
import org.jetbrains.idea.svn.history.SvnKitHistoryClient;
import org.jetbrains.idea.svn.portable.SvnkitSvnStatusClient;
import org.jetbrains.idea.svn.revert.SvnKitRevertClient;

/**
 * @author Konstantin Kolosovsky.
 */
public class SvnKitClientFactory extends ClientFactory {

  public SvnKitClientFactory(@NotNull SvnVcs vcs) {
    super(vcs);
  }

  @Override
  protected void setup() {
    addClient = new SvnKitAddClient();
    historyClient = new SvnKitHistoryClient();
    revertClient = new SvnKitRevertClient();
    deleteClient = new SvnKitDeleteClient();
    statusClient = new SvnkitSvnStatusClient(myVcs.createStatusClient());
  }
}
